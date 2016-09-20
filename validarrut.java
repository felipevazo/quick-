
public boolean validarRut(String rut)
    {
        Pattern patron = Pattern.compile("[\\d]{8,8}-[\\d|k]{1,1}");
        Matcher mat= patron.matcher(rut);
        return (mat.matches());
    }
