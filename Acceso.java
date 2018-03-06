public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    private String ip;
    private String paginaWeb;
    private int codigoRespuesta;

    /**
     * Constructor de la clase Acceso
     * @param elementosLinea es una Array de tipo String que almacena los datos leidos
     */
    public Acceso(String elementos)
    {
        String[] elementosLinea = elementos.split(" ");
        if(elementosLinea.length == 5){
            ano = Integer.parseInt(elementosLinea[0]);
            mes = Integer.parseInt(elementosLinea[1]);
            dia = Integer.parseInt(elementosLinea[2]);
            hora = Integer.parseInt(elementosLinea[3]);
            minutos = Integer.parseInt(elementosLinea[4]);
        }
        else{
            ip = elementosLinea[0];
            ano = Integer.parseInt(elementosLinea[1].substring(1,elementosLinea[1].length()));
            mes = Integer.parseInt(elementosLinea[2]);
            dia = Integer.parseInt(elementosLinea[3]);
            hora = Integer.parseInt(elementosLinea[4]);
            minutos = Integer.parseInt(elementosLinea[5].substring(0,(elementosLinea[5].length()-1)));
            paginaWeb = elementosLinea[6];
            codigoRespuesta = Integer.parseInt(elementosLinea[7]);
        }
    }

    /**
     * getter que devuelve el año
     */
    public int getAno() 
    {
        return ano;
    }
    /**
     * getter que devuelve el mes
     */
    public int getMes()
    {
        return mes;
    }
    /**
     * getter que devuelve el dia
     */
    public int getDia()
    {
        return dia;
    }
    /**
     * getter que devuelve la hora
     */
    public int getHora()
    {
        return hora;
    }
    /**
     * getter que devuelve los minutos
     */
    public int getMinutos()
    {
        return minutos;
    }
}