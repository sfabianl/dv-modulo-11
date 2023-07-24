    public  int mr_digito_verificador(String p_numero, int p_basemax) {
        int v_total = 0;
        int v_resto = 0;
        int k = 2;
        int v_numero_aux = 0;
        String v_numero_al = "";
        int v_digit = 0;

        for (int i = 0; i < p_numero.length(); i++) {
            char v_caracter = Character.toUpperCase(p_numero.charAt(i));

            if (v_caracter >= '0' && v_caracter <= '9') {
                v_numero_al += v_caracter;
            } else {
                v_numero_al += (int) v_caracter;
            }
        }

        k = 2;
        v_total = 0;
        for (int i = v_numero_al.length() - 1; i >= 0; i--) {
            if (k > p_basemax) {
                k = 2;
            }
            v_numero_aux = Integer.parseInt(String.valueOf(v_numero_al.charAt(i)));
            v_total += v_numero_aux * k;
            k++;
        }
        v_resto = v_total % 11;
        if (v_resto > 1) {
            v_digit = 11 - v_resto;
        } else {
            v_digit = 0;
        }
        System.out.println("dv:"+ v_digit);
        return v_digit;
    }

     public void keyPressed(KeyEvent e) {
       
        
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
           verCliente();
          
        }
    }
