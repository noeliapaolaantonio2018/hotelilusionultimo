package hotelilusion.vistas;

import hotelilusion.modelo.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test {
    
    public static void main(String[] args) throws SQLException{
        
        String url = "jdbc:mysql://localhost/hotelilusion";
        String usuario = "root";
        String password = "";
        Connection conexion;
        PreparedStatement ps;
        Conexion con;
        
        try {
            con=new Conexion(url,usuario,password);
            //         Huesped huesped1 = new Huesped("Agustin Ligorria", 44058111,
            //         "Jacinto Suarez 222", 26641212, agus@gmail.com);
            //         huespedData.guardarHuesped(huesped1);
            //         System.out.println("El id del huesped es: " + huesped1.getId_huesped());
            Huesped hesped=new Huesped("Antonio",31276462,"lapunta",15779085,"noleiapaolaantoni@gmail.com");
            HuespedData hd=new HuespedData(con);
            hd.guardarHuesped(hesped);
            
            Huesped hesped1=new Huesped("Kevin",31276462,"lapunta",15779085,"Kevinelmas@gmail.com");
            HuespedData hd1=new HuespedData(con);
            hd1.guardarHuesped(hesped1);
            
            Huesped hesped2=new Huesped("Fede",31276462,"ulp",15779085,"Fedemasgrande@gmail.com");
            HuespedData hd2=new HuespedData(con);
            hd2.guardarHuesped(hesped2);
          
            
            Tipo_habitacion th=new Tipo_habitacion("simple");
            Tipo_habitacionData thd=new Tipo_habitacionData(con);
            thd.guardarTipo_habitacion(th);
            
            
            Habitacion habitacion = new Habitacion(15,3,"economico",2,2,1000,th,true);
            HabitacionData habitaciondata1=new  HabitacionData(con);
            habitaciondata1.guardarHabitacion(habitacion);
            
            LocalDate fr= LocalDate.of(2019,Month.FEBRUARY,19);
            LocalDate fi= LocalDate.of(2019,Month.FEBRUARY,20);
            LocalDate fe= LocalDate.of(2019,Month.FEBRUARY,22);
            
            Reserva reserva = new Reserva(habitacion,hesped,fr,fi,fe,2,true,500,"oferta");
            ResevaData reservadata1=new ResevaData(con);
            reservadata1.guardarReserva(reserva);
            
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
 
 
 
       
    }
    
    
}

        
    

    