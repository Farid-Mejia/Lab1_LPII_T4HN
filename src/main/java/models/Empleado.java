package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	
	@Id
	@Column(name="IdEmpleado")
	private int idempleado;
	
	@Column(name="Apellidos")
	private String apellidos;
	
	@Column(name="Nombres")
	private String nombres;
	
	@Column(name="Edad")
	private String edad;
	
	@Column(name="Sexo")
	private String sexo;
	
	@Column(name="Salario")
	private String salario;
	
	
	
	public Empleado() {
	}
	public Empleado(String apellidos, String nombres, String edad, String sexo, String salario) {
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", apellidos=" + apellidos + ", nombres=" + nombres + ", edad="
				+ edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}
	
	
	
	
	
	
	
}
