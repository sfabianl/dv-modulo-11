# DV modulo11

# Funcion para obtener el DV de un ruc segun la SET (Paraguay).
	Funciones en: PostgreSQL,PHP, Python



# Calculo digito Verificador Modulo 11 PostgreSQL


	Funcion para calcular el DV segun el modulo 11, como funcion en PostgresSQL.}

	Metodo de Uso crear el script en BD:
	ejecutar: 

	select mr_digito_verificador('3535123');
	Result: 3.


# Calculo digito Verificador Modulo 11 PHP

	Funcion para calcular el DV segun Modulo 11, como funcion en PHP
	Ejecutar Funcion:
	$dv=mr_digito_verificador('3535123');
	echo $dv;
	Result: 3.


# Calculo digito Verificador Modulo 11 Python

	Ejecutar Funcion:
	p_numero = "3535123"
	p_basemax = 11

	resultado = mr_digito_verificador(p_numero, p_basemax)

	print(resultado) == 3.
