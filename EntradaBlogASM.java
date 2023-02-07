
public class EntradaBlogASM {


public static char separador=':';
private int id;
private String texto;
private String autor;

    public EntradaBlogASM(int i, String ana, String s) {
    }


    public void EntradaBlog(int id, String autor, String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
        }
@Override
public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
        }

public int getId(){
        return this.id;
        }

public String getTexto(){
        return this.texto;
        }

public String getAutor(){
        return this.autor.toUpperCase();
        }

public String devuelveAutor(){
        return this.autor;
        }

public static void main(String[] args) {
        //Modificar.
        EntradaBlogASM e1=new EntradaBlogASM (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
        }
        }
