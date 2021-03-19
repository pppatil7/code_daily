package com.mindtree;

public class App {
	static int cosmaticSize = 0;
	private static Cosmetic[] cosmetics = new Cosmetic[10];
	
	public static void main(String[] args) {
		
		/*
		 * cosmetics[0] = new Cosmetic(01, "Fair", "HL", 10, 20); cosmaticSize += 1;
		 * cosmetics[1] = new Cosmetic(02, "Soap", "UL", 05, 25); cosmaticSize += 1;
		 * 
		 * // price search App app = new App();
		 * 
		 * System.out.println("====== ByRange ======"); Cosmetic[]
		 * searchedRangedProducts = app.searchByCostRange(22, 30, cosmetics);
		 * app.printCosmetics(searchedRangedProducts);
		 * 
		 * // 2. FindByName Cosmetic[] searchedByNameCosmatics =
		 * app.searchByCosmaticName("fair", cosmetics);
		 * System.out.println("====== ByName ======");
		 * app.printCosmetics(searchedByNameCosmatics);
		 * 
		 * // 3. update quantity Cosmetic updatedDetails = app.updateQuantity(02, 50,
		 * cosmetics); System.out.println("By quantity\n"+ updatedDetails);
		 * 
		 * }
		 * 
		 * public Cosmetic updateQuantity(int id, int newQuantity, Cosmetic[] cosmetics)
		 * { for(int i = 0; i < cosmaticSize; i++) { if(cosmetics[i].getId() == id) {
		 * cosmetics[i].setQuantity(newQuantity); return cosmetics[i]; } } // todo throw
		 * exception -> product not found return null; }
		 * 
		 * public Cosmetic[] searchByCostRange(float minRange, float maxRange,
		 * Cosmetic[] presentCos) { Cosmetic[] renageCosmetics = new
		 * Cosmetic[cosmaticSize]; int counter = 0; for(int i = 0; i < cosmaticSize;
		 * i++) { if(presentCos[i].getPrice() > minRange && presentCos[i].getPrice() <
		 * maxRange) { renageCosmetics[counter] = presentCos[i]; counter++; } } return
		 * renageCosmetics; }
		 * 
		 * public Cosmetic[] searchByCosmaticName(String cosmaticName, Cosmetic[]
		 * presentCos) { Cosmetic[] finalCosmeticsByName = new Cosmetic[cosmaticSize];
		 * int counter = 0; for(int i = 0; i < cosmaticSize; i++) {
		 * if(presentCos[i].getName().equalsIgnoreCase(cosmaticName)) {
		 * finalCosmeticsByName[counter] = presentCos[i]; counter++; } } return
		 * finalCosmeticsByName; }
		 * 
		 * public void printCosmetics(Cosmetic[] cosmetics) { for(Cosmetic cos:
		 * cosmetics) { System.out.println(cos); }
		 */
		
		char ch='a';
		System.out.println(++ch);
		
		
	}

}
