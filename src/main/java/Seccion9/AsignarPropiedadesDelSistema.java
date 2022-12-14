package Seccion9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Properties;

public class AsignarPropiedadesDelSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config2.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.getProperty("mi.apellido","Lopez Muñoz");

            System.setProperties(p);
            Properties ps = System.getProperties();
            System.out.println("p.getProperty... = " + p.getProperty("mi.apellido"));
            System.out.println(System.getProperties());

            ps.list(System.out);
        } catch (Exception e) {
            System.err.println("No existe el archivo:  = " + e);
            System.exit(1);
        }


    }
}
