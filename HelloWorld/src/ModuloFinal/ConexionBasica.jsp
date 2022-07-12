<!--  hibernate.cfg.xml -->
<!DOCTYPE hibernate-configuration PUBLIC
	"-//Hibernate/Hibernate Configuration DTD 3.0.dtd">
	
<hibernate-configuration>
	<session-factory>
		<!--  parametro de conexion -->
		<property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
		<property name="connection.url">jdbc:mysql://localhost:3306/hibernate-demo?useSSL=false&amp;serverTimezone=UTC</property>
		<property name="connection.username">hibernate-demo</property>
		<property name="connection.password">hibernate-demo</property>
		<property name="connection.pool_size">10</property>
		<prop key="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</prop>
		<property name="show_sql">true</property>
		<property name="current_session_context_class">thread</property>
		<property name=2hbm2ddl.auto">update</property>
		</session-factory>

</hibernate-configuration>