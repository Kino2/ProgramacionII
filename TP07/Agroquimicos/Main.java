package Agroquimicos;




public class Main {

	public static void main(String[] args) {
		SistemaAgricola empresa = new SistemaAgricola("Los hermanos");
		Producto pq = new Producto("fertilizante");
		Producto pq2 = new Producto("prueba2");
		Cultivo c1 = new Cultivo("girasol");
		Cultivo c2 = new Cultivo("maiz");
		Cultivo c3 = new Cultivo("lino");
		Enfermedad e1 = new Enfermedad("Cochinilla");
		Enfermedad e2 = new Enfermedad("Pulgon");
		Enfermedad e3 = new Enfermedad("Araña roja");
		
		c1.addEnfermedad(e1);
		c1.addEnfermedad(e2);
		c1.addEnfermedad(e3);
		e1.addEstadoPatalogico("caida de frutos");
		
		//pq.addCultivo(c1); //DESACONSEJADO.
		pq.addCultivoDesaconsejado(c2);
		pq.addCultivoDesaconsejado(c3);
		pq.addEstadoPatalogico("caida de frutos");
		pq2.addEstadoPatalogico("caida de frutos");
		pq2.addCultivoDesaconsejado(c1); //DESACONSEJADO.
		
		empresa.addProducto(pq);
		empresa.addProducto(pq2);
		empresa.addCultivo(c1);
		empresa.addEnfermedad(e1);
		
		System.out.println(empresa.getListadoTrataEnfermedad(e1));
		System.out.println(empresa.getListadoTrataEnfermedadYCultivo(e1,c1));
	}

}
