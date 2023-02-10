def mr_digito_verificador(p_numero, p_basemax=11):
    v_total = 0
    v_resto = 0
    k = 2
    v_numero_al = ""
    v_digit = 0
  
    for i in range(1, len(p_numero)+1):
        v_caracter = p_numero[i-1].upper()
        if ord(v_caracter) not in range(48,57):
            v_numero_al += str(ord(v_caracter))
        else:
            v_numero_al += v_caracter
  
    k = 2
    v_total = 0
    for i in range(len(v_numero_al)-1, -1, -1):
        if k > p_basemax:
            k = 2
        v_numero_aux = int(v_numero_al[i])
        v_total += v_numero_aux * k
        k += 1
  
    v_resto = v_total % 11
    if v_resto > 1:
        v_digit = 11 - v_resto
    else:
        v_digit = 0
  
    return v_digit
