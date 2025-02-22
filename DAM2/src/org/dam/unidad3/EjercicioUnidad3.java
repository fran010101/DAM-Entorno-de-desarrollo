package org.dam.unidad3;

public class EjercicioUnidad3 {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Manuel", "Rodríguez Campos", "12345678A");
		Empleado empleado2 = new Empleado();
		empleado2.setNombre("Antonio");
		empleado2.setApellidos("García Reobollo");
		empleado2.setDni("21342376Q");
		
		Administrativo administrativo1 = new Administrativo("Recursos Humanos", "Oficial 1ª");
		Administrativo administrativo2 = new Administrativo();
		administrativo2.setDepartamento("Seguridad Social");
		administrativo2.setPuesto("Jefe de Servicio");
		
		Contable contable1 = new Contable("Nominas", "Finanzas");
		Contable  contable2 = new Contable();
		contable2.setSeccion("Clientes");
		contable2.setTipoContabilidad("Facturas");
		
		Informatico informatico1 = new Informatico("App Amazon", "Programador");
		Informatico informatico2 = new Informatico();
		informatico2.setProyecto("App Google");
		informatico2.setRol("Jefe de proyecto");
		
		System.out.println("EMPLEADOS:");
		System.out.println();
		System.out.println("Empleado 1:");
		empleado1.mostrarInfo();
		System.out.println();
		System.out.println("Empleado 2:");
		empleado2.mostrarInfo();
		System.out.println();
		
		System.out.println("ADMINISTRATIVOS:");
		System.out.println();
		System.out.println("Administrativo 1:");
		administrativo1.mostrarInfo();
		System.out.println();
		System.out.println("Administrativo 2:");
		administrativo2.mostrarInfo();
		System.out.println();
		
		System.out.println("CONTABLES:");
		System.out.println();
		System.out.println("Contable 1:");
		contable1.mostrarInfo();
		System.out.println();
		System.out.println("Contable 2:");
		contable2.mostrarInfo();
		System.out.println();
		
		System.out.println("INFORMÁTICOS:");
		System.out.println();
		System.out.println("Informático 1:");
		informatico1.mostrarInfo();
		System.out.println();
		System.out.println("Informático 2:");
		informatico2.mostrarInfo();	

	}
	
	static class Empleado {
		private String nombre;
		private String apellidos;
		private String dni;
		
		public Empleado() {
		}

		public Empleado(String nombre, String apellidos, String dni) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}
		
		public void mostrarInfo() {
			System.out.println("Nombre: " + this.nombre 
					+ "\nApellidos: " + this.apellidos 
					+ "\nDNI: " + this.dni);
		}
	}

	static class Administrativo {
		 
		private String departamento;
		private String puesto;

		public Administrativo() {
		}

		public Administrativo(String departamento, String puesto) {
			this.departamento = departamento;
			this.puesto = puesto;
		}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}

		public String getPuesto() {
			return puesto;
		}

		public void setPuesto(String puesto) {
			this.puesto = puesto;
		}
	 
		public void mostrarInfo() {
			System.out.println("Departamento: " + this.departamento 
					+ "\nPuesto: " + this.puesto);
		}
	 
	}
	
	static class Contable {

		private String seccion;
		private String tipoContabilidad;
		
		public Contable() {
		}

		public Contable(String seccion, String tipoContabilidad) {
			this.seccion = seccion;
			this.tipoContabilidad = tipoContabilidad;
		}

		public String getSeccion() {
			return seccion;
		}

		public void setSeccion(String seccion) {
			this.seccion = seccion;
		}

		public String getTipoContabilidad() {
			return tipoContabilidad;
		}

		public void setTipoContabilidad(String tipoContabilidad) {
			this.tipoContabilidad = tipoContabilidad;
		}
		
		public void mostrarInfo() {
			System.out.println("Sección: " + this.seccion
					+ "\nTipo de contabilidad: " + this.tipoContabilidad);
		}
			
			
	}
	
	static class Informatico {

		private String proyecto;
		private String rol;
		
		public Informatico() {
		}

		public Informatico(String proyecto, String rol) {
			this.proyecto = proyecto;
			this.rol = rol;
		}

		public String getProyecto() {
			return proyecto;
		}

		public void setProyecto(String proyecto) {
			this.proyecto = proyecto;
		}

		public String getRol() {
			return rol;
		}

		public void setRol(String rol) {
			this.rol = rol;
		}
		
		public void mostrarInfo() {
			System.out.println("Proyecto: " + this.proyecto
					+ "\nRol: " + this.rol);
		}
	}

}