import com.dounine.japi.JapiClient;
import com.dounine.japi.JapiClientStorage;
import com.dounine.japi.JapiClientTransfer;
import com.dounine.japi.core.IProject;
import com.dounine.japi.core.impl.ProjectImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

public class JapiTest {

	public static void main(String[] args) throws IOException {
		JapiClient.setPrefixPath("/home/ike/java/goddess-java/");//路径前缀
		JapiClient.setpostfixPath("/src/main/java");
		JapiClient.setProjectJavaPath("modules/accruedtax/accruedtax-consumer");//主项目位置
		JapiClient.setActionReletivePath("com/bjike/goddess/accruedtax/action");//主项目action位置
		JapiClient.setIncludeProjectJavaPath(new String[]{//关联项目
				"modules/accruedtax/accruedtax-api",
				"modules/foreigntax/foreigntax-api",
				"common/common-api"
		});
		JapiClient.setIncludePackages(new String[]{"com.bjike.goddess"});//可以准确快速搜索
//		JapiClient.setUseCache(true);//
		JapiClient.setFlushServer(true);
		JapiClient.saveHistory(false);

		IProject project = ProjectImpl.init();
		JapiClientStorage japiClientStorage = JapiClientStorage.getInstance();
		japiClientStorage.setProject(project);
		japiClientStorage.autoSaveToDisk();
		new JapiClientTransfer().autoTransfer(japiClientStorage);
	}

}
