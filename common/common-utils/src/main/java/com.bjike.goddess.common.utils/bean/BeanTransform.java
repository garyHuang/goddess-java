package com.bjike.goddess.common.utils.bean;


import com.bjike.goddess.common.utils.date.DateUtil;

import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 对象转换业务工具, 时间类型会相应转换成字符串类型, 请确保目标源包含同名字符串类型属性
 * 因远程调用不允许出现(LocalDateTime,LocalDate,LocalTime)等类型,时间类型必须转换成字符串(默认)
 * 同样的,保存实体的时候也不能直接出现时间类型,convertDate参数为true时会把字符串转换成相应时间类型
 *
 * @Author: [liguiqin]
 * @Date: [2017-01-24 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class BeanTransform {
    private static final Type[] DATE_TYPES = new Type[]{LocalDateTime.class, LocalDate.class, LocalTime.class};

    private BeanTransform() {

    }

    /**
     * 复制列表对象属性
     *
     * @param sources  转换对象源列表
     * @param target   目标类
     * @param excludes 过滤字段
     * @return List<TARGET>目标对象列表
     * @throws RuntimeException 反射复制属性类异常,时间格式转换异常
     */
    public static <TARGET, SOURCE> List<TARGET> copyProperties(Collection<SOURCE> sources, Class target, String... excludes){
        return copyList(sources, target, false, excludes);

    }

    /**
     * 复制列表对象属性
     *
     * @param sources     转换对象源列表
     * @param target      目标类
     * @param excludes    过滤字段
     * @param convertDate 是否处理字符串转换日期 false 处理,true 不处理
     * @return List<TARGET>目标对象列表
     * @throws RuntimeException 反射复制属性类异常,时间格式转换异常
     */
    public static <TARGET, SOURCE> List<TARGET> copyProperties(Collection<SOURCE> sources, Class target, boolean convertDate, String... excludes) {
        return copyList(sources, target, convertDate, excludes);

    }

    /**
     * @param source   源对象
     * @param target   目标类
     * @param <TARGET> 目标对象
     * @param excludes 过滤属性
     * @return 目标对象
     * @throws RuntimeException 反射复制属性类异常,时间格式转换异常
     */
    public static <TARGET, SOURCE> TARGET copyProperties(SOURCE source, Class target, String... excludes) {
        if (null != source) {
            try {
                Object o_target = target.newInstance();
                copyProperties(source, o_target, excludes);
                return (TARGET) o_target;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return null;

    }


    /**
     * 对象属性复制
     *
     * @param source   源对象
     * @param target   目标对象
     * @param excludes 过滤字段
     * @throws RuntimeException 反射复制属性类异常,时间格式转换异常
     */
    public static void copyProperties(Object source, Object target, String... excludes) {
        try {
            handlerClazz(source, target, excludes);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


    /**
     * 该方法会判定包含合法日期的字符串并转换到相应属性
     * 对象属性复制
     * 是否处理字符串转换日期
     *
     * @param source      源对象
     * @param target      目标对象
     * @param convertDate 是否处理字符串转换日期 false 处理,true 不处理
     * @param excludes    过滤字段
     * @throws RuntimeException 反射复制属性类异常,时间格式转换异常
     */
    public static void copyProperties(Object source, Object target, boolean convertDate, String... excludes) {
        try {
            handlerClazz(source, target, convertDate, excludes);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    /**
     * @param source   源对象
     * @param target   目标类
     * @param <TARGET> 目标对象
     * @param excludes 过滤属性
     * @throws RuntimeException 反射复制属性类异常,时间格式转换异常
     * @return
     */
    public static <TARGET, SOURCE> TARGET copyProperties(SOURCE source, Class target, boolean convertDate, String... excludes) {
        if (null != source) {
            try {
                Object o_target = target.newInstance();
                copyProperties(source, o_target, convertDate, excludes);
                return (TARGET) o_target;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return null;

    }


    /**
     * 复制列表对象属性
     */
    private static <TARGET, SOURCE> List<TARGET> copyList(Collection<SOURCE> sources, Class target, boolean convertDate, String... excludes) {
        List<TARGET> targets = null;
        if (null != sources && sources.size() > 0) {
            targets = new ArrayList<>(sources.size());
            try {
                for (SOURCE source : sources) {
                    Object o_target = target.newInstance();
                    copyProperties(source, o_target, convertDate, excludes);
                    targets.add((TARGET) o_target);
                }
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return targets;
    }


    private static void handlerClazz(Object source, Object target, boolean convertDate, String... excludes) throws Exception {
        handlerCopyFields(source, target, convertDate, excludes);
    }

    private static void handlerClazz(Object source, Object target, String... excludes) throws Exception {
        handlerCopyFields(source, target, false, excludes);
    }


    /**
     * 处理反射类及复制熟悉
     *
     * @param source      源
     * @param target      目标
     * @param convertDate 是否处理日期
     * @param excludes    过滤熟悉
     * @throws Exception
     */
    private static void handlerCopyFields(Object source, Object target, boolean convertDate, String... excludes) throws Exception {
        Class s_clazz = source.getClass();
        Class t_clazz = target.getClass();
        boolean first = true;
        while (null != t_clazz) { //目标类父类
            if (!first) {
                s_clazz = s_clazz.getSuperclass();
                t_clazz = t_clazz.getSuperclass();
                if (Object.class.equals(t_clazz) || null == t_clazz) {
                    break;
                }
            }
            first = false;
            Field[] s_fields = s_clazz.getDeclaredFields(); //源对象属性
            Field[] t_fields = t_clazz.getDeclaredFields();//目标对象属性
            Method[] methods = t_clazz.getDeclaredMethods();
            for (Field t_field : t_fields) {
                boolean has_ex = false;
                if (null != excludes && excludes.length > 0) {
                    for (String exclude : excludes) {
                        if (exclude.equals(t_field.getName())) {
                            has_ex = true;
                            break;
                        }
                    }
                    if (has_ex) {
                        continue;
                    }
                }

                for (Field s_field : s_fields) {
                    if (t_field.getName().equals(s_field.getName())) { //同名属性
                        t_field.setAccessible(true);
                        s_field.setAccessible(true);
                        Object s_val = s_field.get(source);
                        if (null == s_val) {
                            break;
                        }
                        if (!convertDate) { //处理字符串转日期
                            s_val = convertStringType(s_field.getType(), s_val);
                        } else {
                            for (Type type : DATE_TYPES) {
                                if (type.equals(t_field.getType())) {
                                    s_val = convertDateType(type, s_val);
                                    break;
                                }
                            }
                        }
                        String methodName = "set" + upperCaseFirst(t_field.getName());
                        for (Method m : methods) { //找到相应方法
                            if (m.getName().equals(methodName)) {
                                m.invoke(target, s_val);
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    private static String upperCaseFirst(String val) {
        if (!Character.isUpperCase(val.charAt(0))) {
            char[] cs = val.toCharArray();
            cs[0] -= 32;
            return String.valueOf(cs);
        }
        return val;
    }

    /**
     * 时间转换成字符串
     *
     * @param type
     * @param val
     * @return
     */
    private static Object convertStringType(Type type, Object val) {
        if (type.equals(LocalDateTime.class)) {
            val = String.valueOf(DateUtil.dateToString((LocalDateTime) val));
        } else if (type.equals(LocalDate.class)) {
            val = String.valueOf(DateUtil.dateToString((LocalDate) val));
        } else if (type.equals(LocalTime.class)) {
            val = String.valueOf(DateUtil.dateToString((LocalTime) val));
        }
        return val;
    }

    /**
     * 字符串转换成时间
     *
     * @param type
     * @param val
     * @return
     */
    private static Object convertDateType(Type type, Object val) {
        if (type.equals(LocalDateTime.class)) {
            val = DateUtil.parseDateTime(String.valueOf(val));
        } else if (type.equals(LocalDate.class)) {
            val = DateUtil.parseDate(String.valueOf(val));
        } else if (type.equals(LocalTime.class)) {
            val = DateUtil.parseTime(String.valueOf(val));
        }
        return val;
    }


}