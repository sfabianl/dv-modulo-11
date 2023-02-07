# dvmod1-1
Calculo digito Verificador Modulo 11 PostgreSQL

-- FUNCTION: public.mr_digito_verificador(character varying, numeric)

-- DROP FUNCTION IF EXISTS public.mr_digito_verificador(character varying, numeric);

CREATE OR REPLACE FUNCTION public.mr_digito_verificador(
	p_numero character varying,
	p_basemax numeric DEFAULT 11)
    RETURNS numeric
    LANGUAGE 'plpgsql'
    COST 100
    VOLATILE PARALLEL UNSAFE
AS $BODY$
declare
  v_total integer;
  v_resto smallint;
  k smallint;
  v_numero_aux smallint;
  v_numero_al varchar(255);
  v_caracter varchar(1);
  v_digit numeric;
begin
  for i in 1..LENGTH(p_numero) loop
    v_caracter = UPPER(SUBSTR(p_numero, i, 1));
   
    if ASCII(v_caracter) not between 48 and 57 then
      v_numero_al = concat(v_numero_al,ASCII(v_caracter));
    else
      v_numero_al = concat(v_numero_al,v_caracter);
    end if;
   
  end loop;

  k = 2;
  v_total = 0;
  for i in reverse LENGTH(v_numero_al)..1 loop
    if k > p_basemax then
      k = 2;
    end if;
    v_numero_aux = (SUBSTR(v_numero_al, i, 1))::integer;
    v_total = v_total + v_numero_aux * k;
    k = k + 1;
  end loop;
  v_resto = MOD(v_total, 11);
  if v_resto > 1 then
    v_digit = 11 - v_resto;
  else
    v_Digit = 0;
  end if;
  return v_Digit;
end;
$BODY$;

ALTER FUNCTION public.mr_digito_verificador(character varying, numeric)
    OWNER TO postgres;

