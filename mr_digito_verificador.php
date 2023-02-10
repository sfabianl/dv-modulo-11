function mr_digito_verificador($p_numero, $p_basemax = 11) {
    $v_total = 0;
    $v_resto = 0;
    $k = 2;
    $v_numero_aux = 0;
    $v_numero_al = "";
    $v_digit = 0;
    
    for ($i = 0; $i < strlen($p_numero); $i++) {
        $v_caracter = strtoupper($p_numero[$i]);
        
        if (ord($v_caracter) >= 48 && ord($v_caracter) <= 57) {
            $v_numero_al .= $v_caracter;
        } else {
            $v_numero_al .= ord($v_caracter);
        }
    }

    $k = 2;
    $v_total = 0;
    for ($i = strlen($v_numero_al) - 1; $i >= 0; $i--) {
        if ($k > $p_basemax) {
            $k = 2;
        }
        $v_numero_aux = intval($v_numero_al[$i]);
        $v_total += $v_numero_aux * $k;
        $k++;
    }
    $v_resto = $v_total % 11;
    if ($v_resto > 1) {
        $v_digit = 11 - $v_resto;
    } else {
        $v_digit = 0;
    }
    
    return $v_digit;
}
