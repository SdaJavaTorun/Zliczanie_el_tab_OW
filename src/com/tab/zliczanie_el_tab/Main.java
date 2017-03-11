package com.tab.zliczanie_el_tab;

        public class Main {

            private static int a[];

            public static void main(String[] args) {

                int[] tab = {4, 1, 6, 1, 3};
                int wynik = 0;

                for (int i=0; i<tab.length; i++) {

                    wynik += tab[i];

                }
                System.out.println("Suma el. tab. to " +wynik);
            }
        }

