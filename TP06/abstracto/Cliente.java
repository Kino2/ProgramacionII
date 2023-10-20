package abstracto;


import java.util.ArrayList;


public class Cliente {
   private ArrayList<Alquiler> alquileres;

   public Cliente() {
      
      alquileres = new ArrayList<>();
   }

   public boolean tieneAlquileresVencidos() {
      for (int i = 0; i < alquileres.size(); i++) {
         if (alquileres.get(i).seVence()) {
            return true;
         }
      }
      return false;
   }

   public void addAlquiler(Alquiler alquiler) {
      alquileres.add(alquiler);
   }

}
