import com.dounine.japi.JapiClient;
import com.dounine.japi.JapiClientStorage;
import com.dounine.japi.JapiClientTransfer;
import com.dounine.japi.core.IProject;
import com.dounine.japi.core.impl.ProjectImpl;

import java.io.IOException;
public class JapiTest {
	public static void main(String[] args) throws IOException {
		JapiClient.setPrefixPath("/home/ike/goddess/goddess-java/");//路径前缀
		JapiClient.setpostfixPath("/src/main/java");
		JapiClient.setProjectJavaPath("modules/organize/organize-consumer");//主项目位置
		JapiClient.setActionReletivePath("com/bjike/goddess/organize/action");//主项目action位置
		JapiClient.setIncludeProjectJavaPath(new String[]{//关联项目
				"modules/organize/organize-api",
				"modules/user/user-api",
				"modules/contacts/contacts-api",
				"modules/businessproject/businessproject-api",
				"common/common-api"
		});
		JapiClient.setFlushServer(true);
		JapiClient.setIncludePackages(new String[]{"com.bjike.goddess"});//可以准确快速搜索
		IProject project = ProjectImpl.init();
		JapiClientStorage japiClientStorage = JapiClientStorage.getInstance();
		japiClientStorage.setProject(project);
		japiClientStorage.autoSaveToDisk();
		new JapiClientTransfer().autoTransfer(japiClientStorage);
	}

}
