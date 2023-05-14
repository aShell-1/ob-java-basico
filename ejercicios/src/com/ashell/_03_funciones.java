package com.ashell;
// Crear una función que reciba un precio y devuelva el precio con el IVA incluido.

public class _03_funciones {
    public static void main(String[] args) {
        float priceWithoutIVA = 560.25f;
        float priceWithIVA = getPriceWithIVA(priceWithoutIVA);

        System.out.println(
                "Original price: " + priceWithoutIVA + "\n" +
                "Price with IVA: " + priceWithIVA
        );
    }

    /**
     * @param price float value
     * @return A price with the IVA value increased
     */
    private static float getPriceWithIVA(float price) {
        float ivaValue = 0.21f;
        return (1 + ivaValue) * price;
    }
}
