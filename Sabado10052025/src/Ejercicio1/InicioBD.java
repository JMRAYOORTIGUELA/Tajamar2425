package Ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// BASE DE DATOS
//create database GESTISIMAL;
//use GESTISIMAL;
//create table productos(
//		codigo int primary key,
//	    descripcion varchar(255),
//	    precio_compra double,
//	    precio_venta double,ARTICULOS
//	    stock int
//);

public class InicioBD {
	static Scanner sc = new Scanner(System.in);
	static String usuario = "root", passwd = "RAYORAYO#1a", bbdd = "GESTISIMAL";

	/********************************************************************************************************************/
	public static String menu(String[] opciones) {
		for (int i = 0; i < opciones.length; i++)
			System.out.println((i + 1) + ". " + opciones[i]);

		System.out.print("Seleccion: ");
		int sel;
		do {
			sel = Integer.valueOf(sc.nextLine());
		} while (sel < 0 || sel > opciones.length);

		return opciones[sel - 1];
	}

	/********************************************************************************************************************/
	public static boolean isCodigo(String codigo) {
		int n = 0;
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + bbdd, usuario, passwd);
				PreparedStatement sentencia = con
						.prepareStatement("select count(*) NU from ARTICULOS WHERE CODIGO= ?");) {
			sentencia.setString(1, codigo);
			ResultSet resultados = sentencia.executeQuery();
			while (resultados.next()) {
				n = resultados.getInt("NU");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
		}
		if (n == 0)
			return false;
		return true;
	}

	/********************************************************************************************************************/
	public static void crear(String BBDD, String cadena) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + BBDD, usuario, passwd);
				PreparedStatement preparedStatement = conn.prepareStatement(cadena);) {
			preparedStatement.execute();

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s\n", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/********************************************************************************************************************/
	public static void listar() {
		ArrayList<Articulo> result = new ArrayList<Articulo>();
		String cadena = "SELECT * FROM ARTICULOS ORDER BY CODIGO";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + bbdd, usuario, passwd);
				PreparedStatement preparedStatement = conn.prepareStatement(cadena)) {
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				String codigo = resultSet.getString("CODIGO");
				String descripcion = resultSet.getString("DESCRIPCION");
				double precio_compra = resultSet.getDouble("PRECIO_COMPRA");
				double precio_venta = resultSet.getDouble("PRECIO_VENTA");
				int stock = resultSet.getInt("STOCK");

				Articulo obj = new Articulo(codigo, descripcion, precio_compra, precio_venta, stock);

				result.add(obj);

			}
			result.forEach(System.out::println);

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/********************************************************************************************************************/
	public static void insertar(Articulo art) {
		String cadena = "INSERT INTO ARTICULOS VALUES (?,?,?,?,?)";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + bbdd, usuario, passwd);
				PreparedStatement preparedStatement = conn.prepareStatement(cadena)) {

			preparedStatement.setString(1, art.getCodigo());
			preparedStatement.setString(2, art.getDescripcion());
			preparedStatement.setDouble(3, art.getPrecio_compra());
			preparedStatement.setDouble(4, art.getPrecio_venta());
			preparedStatement.setInt(5, art.getStock());

			int row = preparedStatement.executeUpdate();

			System.out.println("El numero de filas insertadas " + row);

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/********************************************************************************************************************/
	public static void borrar(String codigo) {
		String cadena = "DELETE FROM ARTICULOS WHERE CODIGO=?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + bbdd, usuario, passwd);
				PreparedStatement preparedStatement = conn.prepareStatement(cadena)) {

			preparedStatement.setString(1, codigo);
			int row = preparedStatement.executeUpdate();

			System.out.println("El numero de filas eliminadas " + row);
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/********************************************************************************************************************/
	public static void altaDatos() {
		String cod, des;
		double precioCompra, precioVenta;
		int stock;
		boolean existe;

		System.out.println("Se va a agregar un nuevo articulo");
		do {
			System.out.print("Codigo: ");
			cod = sc.nextLine();
			existe = isCodigo(cod);
		} while (existe);

		System.out.print("Descripción: ");
		des = sc.nextLine();
		System.out.print("Precio Compra: ");
		precioCompra = Double.valueOf(sc.nextLine());
		System.out.print("Precio Venta: ");
		precioVenta = Double.valueOf(sc.nextLine());
		System.out.print("Stock inicial: ");
		stock = Integer.valueOf(sc.nextLine());

		insertar(new Articulo(cod, des, precioCompra, precioVenta, stock));
		System.out.println("Producto introducido.");
	}

	/********************************************************************************************************************/
	public static void bajaDatos() {
		String cod;
		boolean existe;

		System.out.println("Se va a eliminar un articulo ");
		do {
			System.out.print("Codigo: ");
			cod = sc.nextLine();
			existe = isCodigo(cod);
		} while (!existe);
		borrar(cod);
	}

	/********************************************************************************************************************/
	public static Articulo existeCodigo(String codigo_old) {
		Articulo nuevo = null;
		String cadena = "SELECT * FROM ARTICULOS WHERE CODIGO=?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + bbdd, usuario, passwd);
				PreparedStatement preparedStatement = conn.prepareStatement(cadena)) {
			preparedStatement.setString(1, codigo_old);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				String codigo = resultSet.getString("CODIGO");
				String descripcion = resultSet.getString("DESCRIPCION");
				double precio_compra = resultSet.getDouble("PRECIO_COMPRA");
				double precio_venta = resultSet.getDouble("PRECIO_VENTA");
				int stock = resultSet.getInt("STOCK");

				nuevo = new Articulo(codigo, descripcion, precio_compra, precio_venta, stock);
			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return nuevo;
		}
	}

	/********************************************************************************************************************/
	public static void actualizar(String codigo, Articulo art) {
		String cadena = "UPDATE ARTICULOS SET CODIGO=?,DESCRIPCION=?,PRECIO_COMPRA=?,PRECIO_VENTA=?,STOCK=? WHERE CODIGO=?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + bbdd, usuario, passwd);
				PreparedStatement preparedStatement = conn.prepareStatement(cadena)) {

			preparedStatement.setString(1, art.getCodigo());
			preparedStatement.setString(2, art.getDescripcion());
			preparedStatement.setDouble(3, art.getPrecio_compra());
			preparedStatement.setDouble(4, art.getPrecio_venta());
			preparedStatement.setInt(5, art.getStock());
			preparedStatement.setString(6, codigo);

			int row = preparedStatement.executeUpdate();

			System.out.println("El numero de filas actualizadas " + row);

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/********************************************************************************************************************/
	public static void modificar() {
		String codigo = null, new_codigo = null, descripcion = null, precio_venta = null, precio_compra = null,
				stock = null;
		Articulo art = null;

		while (true) {
			System.out.print("Dime el codigo ");
			codigo = sc.nextLine();
			art = existeCodigo(codigo);
			if (art != null)
				break;
			System.out.println("El " + codigo + " no existe.");
		}
		;

		System.out.println("Código: " + art.getCodigo());
		System.out.print("Nuevo código: ");
		new_codigo = sc.nextLine();
		if (!new_codigo.equals(""))
			art.setCodigo(new_codigo);

		System.out.println("Descripción: " + art.getDescripcion());
		System.out.print("Nueva descripción: ");
		descripcion = sc.nextLine();
		if (!descripcion.equals(""))
			art.setDescripcion(descripcion);

		System.out.println("Precio de compra: " + art.getPrecio_compra());
		System.out.print("Nuevo precio de compra: ");
		precio_compra = sc.nextLine();
		if (!precio_compra.equals(""))
			art.setPrecio_compra(Double.parseDouble(precio_compra));

		System.out.println("Precio de venta: " + art.getPrecio_venta());
		System.out.print("Nuevo precio de venta: ");
		precio_venta = sc.nextLine();
		if (!precio_venta.equals(""))
			art.setPrecio_venta(Double.parseDouble(precio_venta));

		System.out.println("Stock: " + art.getStock());
		System.out.print("Nuevo stock: ");
		stock = sc.nextLine();
		if (!stock.equals(""))
			art.setStock(Integer.parseInt(stock));
		actualizar(codigo, art);

	}
	/********************************************************************************************************************/
	public static void entrada_mercancia() {
		String codigo = null,stock = null;
		Articulo art = null;

		while (true) {
			System.out.print("Dime el codigo ");
			codigo = sc.nextLine();
			art = existeCodigo(codigo);
			if (art != null)
				break;
			System.out.println("El " + codigo + " no existe.");
		};

		System.out.println("Stock: " + art.getStock());
		System.out.print("Añadir al stock: ");	stock = sc.nextLine();
		if (!stock.equals(""))art.setStock(art.getStock()+Integer.parseInt(stock));
		actualizar(codigo, art);
	}
	/********************************************************************************************************************/
	public static void salida_mercancia() {
		String codigo = null;
		int stock = 0;
		Articulo art = null;

		while (true) {
			System.out.print("Dime el codigo ");
			codigo = sc.nextLine();
			art = existeCodigo(codigo);
			if (art != null)
				break;
			System.out.println("El " + codigo + " no existe.");
		};

		System.out.print("Stock a retirar: ");stock = Integer.valueOf(sc.nextLine());


		if (art.getStock()- stock<0) {
			System.out.println("Solo quedan " + art.getStock() + " unidades en el almacen.");
			System.out.print("¿Sacar " + art.getStock() + "? (s/n): ");
			String resp = sc.nextLine();
			if (resp.equalsIgnoreCase("s")) {
			    art.setStock(0);
			}else {
				System.out.println("Cancelando operacion");
				return;
			}
		}
		actualizar(codigo, art);
	}
	/********************************************************************************************************************/
	public static void main(String[] args) {

		String accion1 = "CREATE DATABASE IF NOT EXISTS " + bbdd;
		String accion2 = "CREATE TABLE ARTICULOS(CODIGO VARCHAR(10) PRIMARY KEY,DESCRIPCION VARCHAR(255),PRECIO_COMPRA DOUBLE,PRECIO_VENTA DOUBLE,STOCK INT)";

		crear("sys", accion1);
		crear("GESTISIMAL", accion2);

		try {

			String[] opciones = { "Listado", "Alta", "Baja", "Modificación", "Entrada de mercancía",
					"Salida de mercancía", "Salir" };
			ResultSet resultSet;

			while (true) {
				String sel = menu(opciones);
				switch (sel) {
				case "Listado":
					listar();
					break;
				case "Alta":
					altaDatos();
					break;
				case "Baja":
					bajaDatos();
					break;
				case "Modificación":
					modificar();
					break;
				case "Entrada de mercancía":
					entrada_mercancia();
					break;
				case "Salida de mercancía":
					salida_mercancia();
					break;
				case "Salir":
					return;
				}
			}
	

	}catch(Exception e) {
		System.out.println("Error");
	}

}
}