package door;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
        public Connection getConnection() throws ClassNotFoundException, SQLException {
                // 드라이버 로딩
                Class.forName("org.mariadb.jdbc.Driver");
                // 커넥션 맺기
                String url = "jdbc:mariadb://localhost:3307/devdb";
				String user = "devuser";
				String password = "devpass";
				return DriverManager.getConnection(url, user, password);
				//return DriverManager.getConnection("jdbc:mariadb://localhost:3307/devdb", "devuser", "devpass");
				//위 코드를 Alt + shift + L 사용해서 변수로 만들어 줌
        }
}