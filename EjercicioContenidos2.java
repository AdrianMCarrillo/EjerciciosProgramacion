public class EjercicioContenidos2 {
	public static void main(String[] args) {
		int[] array1 = {1, 1, 1, 2, 10, 3, 4};
		int[] array2 = {8, 4, 5, 2, 10, 14, 3};

		if(contenidosEn(array1, array2)) {
			System.out.println("El array1 esta contenido en array2");
		} else {
			System.out.println("El array1 no esta contenido en array2");
		}
	}
	
	public static boolean contenidosEn(int[] array1, int[] array2) {
		int contador = 0;
		boolean arraycontenido = true;
		boolean elementocontenido = false;
		for(int i=0; i<array1.length && arraycontenido; i++) {
			for(int j=0; j<array2.length && !elementocontenido; j++) {
				if(array1[i]==array2[j]) {
					elementocontenido = true;
				}
			}
			if(elementocontenido==false) {
				arraycontenido = false;
			}
		}
		return arraycontenido;
	}
}
	
	
/*	public static boolean contenidosEn(int[] array1, int[] array2) {
		int contador = 0;
		boolean contenido = false;
		for(int i=0; j<array1.length && !contenido; i++) {
			if(array2[i] == array1[contador]) {
				contador++;
			}
			if(contador == array1.length) {
				contenido = true;
			}
		}
		return contenido;			
	}
*/