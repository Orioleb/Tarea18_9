import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class LosInvestigadores {

	static String user="Oriol";
	static String password="Oriol101";
	static String bd="Ejercicio18_9";
	static String url="jdbc:mysql://localhost:3306/"+bd;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connexion=null;
		try {
			String s=url;
			connexion=DriverManager.getConnection(s, user, password);
			if (connexion != null) {
			System.out.println("Conexion a mibase satisfacoria");
			Statement st;
			st=connexion.createStatement();
			/*
			st.executeUpdate("create table facultad("
					+ "	id int not null,"
					+ "nombre nvarchar(100),"
					+ "primary key(id)"
					+ ")");
			st.executeUpdate("create table investigadores("
					+ "dni varchar(8),"
					+ "nombre nvarchar(255),"
					+ "facultad int,"
					+ "primary key(dni),"
					+ "key(facultad),"
					+ "foreign key(facultad)"
					+ "references facultad(id)"
					+ ")");
			st.executeUpdate("create table equipos("
					+ "numserie char(4),"
					+ "nombre nvarchar(100),"
					+ "facultad int,"
					+ "primary key(numserie),"
					+ "key(facultad),"
					+ "foreign key(facultad)"
					+ "references facultad(id)"
					+ ")");
			st.executeUpdate("create table reserva("
					+ "	dni varchar(8),"
					+ "numserie char(4),"
					+ "comienzo datetime,"
					+ "fin datetime,"
					+ "primary key(dni,numserie),"
					+ "key(dni),"
					+ "foreign key(dni)"
					+ "references investigadores(dni),"
					+ "key(numserie),"
					+ "foreign key(numserie)"
					+ "references equipos(numserie)"
					+ ")");*/
			st.executeUpdate("INSERT INTO facultad VALUE "
				+ "	(1,'Ingenieria'),"
				+ "    (2,'Matematicas'),"
				+ "    (3,'Economia'),"
				+ "    (4,'Medicina'),"
				+ "    (5,'Derecho'),"
				+ "    (6,'Ciencias Politicas'),"
				+ "    (7,'Industriales'),"
				+ "    (8,'Fisica'),"
				+ "    (9,'Biologia'),"
				+ "    (10,'Quimica')");
			
			st.executeUpdate("INSERT INTO investigadores VALUE "
					+ "('2222222R','Joan',1),"
					+ "('2228744Z','Anna',1),"
					+ "('4252022A','Albert',1),"
					+ "('1232202F','Pau',2),"
					+ "('2021272R','Marc',2),"
					+ "('9213252I','Gonzalo',2),"
					+ "('2224442G','Victor',3),"
					+ "('2389572H','Andrea',3),"
					+ "('2020202N','Joana',3),"
					+ "('1123212O','Lluis',4)");
			st.executeUpdate("INSERT INTO equipos VALUE "
					+ "('ABC','EquipoURV',1),"
					+ "('ABD','EquipoUB',2),"
					+ "('ABE','EquipoUPC',3),"
					+ "('ABF','EquipoUAB',4),"
					+ "('ABG','EquipoUPM',5),"
					+ "('ABH','EquipoUPV',6),"
					+ "('ABI','EquipoGEB',7),"
					+ "('ABJ','EquipoGESST',8),"
					+ "('ABK','EquipoTelecos',9),"
					+ "('ABL','EquipoETSEIB',10)");
			st.executeUpdate("INSERT INTO reserva VALUE" + "	('2222222R','ABC','2022-06-17 15:30:40','2022-07-14 15:30:40'),"
					+ "('2228744Z','ABD','2022-06-17 15:30:40','2022-07-14 15:30:40'),"
					+ "('4252022A','ABE','2022-06-17 15:30:40','2022-07-14 15:30:40'),"
					+ "('1232202F','ABF','2022-06-17 15:30:40','2022-07-14 15:30:40'),"
					+ "('2021272R','ABG','2022-06-17 15:30:40','2022-07-14 15:30:40'),"
					+ "('9213252I','ABH','2022-06-17 15:30:40','2022-07-14 15:30:40'),"
					+ "('2224442G','ABI','2022-06-17 15:30:40','2022-07-14 15:30:40'),"
					+ "('2389572H','ABJ','2022-06-17 15:30:40','2022-07-14 15:30:40'),"
					+ "('2020202N','ABK','2022-06-17 15:30:40','2022-07-14 15:30:40'),"
					+ "('1123212O','ABL','2022-06-17 15:30:40','2022-07-14 15:30:40')");
			System.out.println("Taulas creadas");
			}
			Properties datos = new Properties();
			datos.put("user", user);
			datos.put("password", password);
			

		}catch (SQLException e) {
			System.out.println("Error en la conexión, verifique, su usuario y password o el nombre de la base a la que intenta conectarse");
					e.printStackTrace();

		}
	}

}
