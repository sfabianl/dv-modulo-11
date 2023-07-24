# DV modulo11 ekuatia, sifen

# Función para obtener el DV de un ruc según la SET (Paraguay).
	Funciones en: PostgreSQL,PHP, Python, JAVA



# Cálculo digito Verificador Modulo 11 PostgreSQL


	Función para calcular el DV segun el modulo 11, como Función en PostgresSQL.}

	Metodo de Uso crear el script en BD:
	ejecutar: 

	select mr_digito_verificador('3535123');
	Result: 3.


# Cálculo digito Verificador Modulo 11 PHP

	Función para calcular el DV segun Modulo 11, como Función en PHP
	Ejecutar Funcion:
	$dv=mr_digito_verificador('3535123');
	echo $dv;
	Result: 3.


# Cálculo digito Verificador Modulo 11 Python

	Ejecutar Función:
	p_numero = "3535123"
	p_basemax = 11

	resultado = mr_digito_verificador(p_numero, p_basemax)

	print(resultado) == 3.

 
# Cálculo digito Verificador Modulo 11 JAVA

	Función para calcular el DV segun Modulo 11, como Función en JAVA
	Llamar al metodo:
	int dv=mr_digito_verificador('3535123',11);
	System.out.println("dv: " + dv);
	
