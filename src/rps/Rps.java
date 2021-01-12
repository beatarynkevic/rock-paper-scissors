package rps;

import java.util.Scanner;

public class Rps {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Kiek partiju: ");
        int zKiekis = sc.nextInt();

        int zLaimejo = 0;
        int kLaimejo = 0;
        int lygiosios = 0;
        int zAkmuo = 0;
        int zZirkles = 0;
        int zPopierius = 0;
        int kAkmuo = 0;
        int kZirkles = 0;
        int kPopierius = 0;

        for (int i = 0; i < zKiekis; i++) {
            int zp = (int) (Math.random() * 3) + 1;
            int kp = (int) (Math.random() * 3) + 1;

            if (zp == 1) {
                zAkmuo++;
            } else if (zp == 2) {
                zZirkles++;
            } else if (zp ==3) {
                zPopierius++;
            }

            if (kp == 1) {
                kAkmuo++;
            } else if (kp == 2) {
                kZirkles++;
            } else if (kp == 3) {
                kPopierius++;
            }

            if (zp == kp) {
                lygiosios++;
            } else if (zp == 1) {
                if (kp == 2) {
                    zLaimejo++;
                } else if (kp == 3) {
                    kLaimejo++;
                }
            } else if (zp == 2) {
                if (kp == 3) {
                    zLaimejo++;
                } else if (kp == 1) {
                    kLaimejo++;
                }
            } else if (zp == 3) {
                if (kp == 1) {
                    zLaimejo++;
                } else if (kp == 2) {
                    kLaimejo++;
                }
            }
        }

        int zp;

        do {
            System.out.println("1. Akmuo");
            System.out.println("2. Zirkles");
            System.out.println("3. Popierius");
            System.out.println("0. Pabaiga");

            zp = sc.nextInt();
            if (zp != 0) {
                zKiekis++;
                int kp = (int) (Math.random() * 3) + 1;

                System.out.print("Kompiuteris pasirinko: ");
                if (kp == 1) {
                    kAkmuo++;
                    System.out.println("akmuo");
                } else if (kp == 2) {
                    kZirkles++;
                    System.out.println("zirkles");
                } else if (kp == 3) {
                    kPopierius++;
                    System.out.println("popierius");
                }

                if (zp == 1) {
                    zAkmuo++;
                } else if (zp == 2) {
                    zZirkles++;
                } else if (zp ==3) {
                    zPopierius++;
                }
                if (zp == kp) {
                    lygiosios++;
                    System.out.println("Lygiosios");
                } else if (zp == 1) {
                    if (kp == 2) {
                        zLaimejo++;
                        System.out.println("Laimejo zmogus");
                    } else if (kp == 3) {
                        kLaimejo++;
                        System.out.println("Laimejo kompas");
                    }
                } else if (zp == 2) {
                    if (kp == 3) {
                        zLaimejo++;
                        System.out.println("Laimejo zmogus");
                    } else if (kp == 1) {
                        kLaimejo++;
                        System.out.println("Laimejo kompas");
                    }
                } else if (zp == 3) {
                    if (kp == 1) {
                        zLaimejo++;
                        System.out.println("Laimejo zmogus");
                    } else if (kp == 2) {
                        kLaimejo++;
                        System.out.println("Laimejo kompas");
                    }
                }
            }
        } while (zp != 0);


        System.out.println("Zaidimu kiekis: " + zKiekis);
        System.out.println("Laimejo zmogus: " + zLaimejo);
        System.out.println("Laimejo kompas: " + kLaimejo);
        System.out.println("Lygiosios: " + lygiosios);
        System.out.println("Zmogus akmuo: " + zAkmuo + " " + (1.0 * zAkmuo / zKiekis));
        System.out.println("Zmogus zirkles: " + zZirkles + " " + (1.0 * zZirkles / zKiekis));
        System.out.println("Zmogus popierius: " + zPopierius + " " + (1.0 * zPopierius / zKiekis));
        System.out.println("Kompas akmuo: " + zAkmuo + " " + (1.0 * kAkmuo / zKiekis));
        System.out.println("Kompas zirkles: " + zZirkles + " " + (1.0 * kZirkles / zKiekis));
        System.out.println("Kompas popierius: " + zPopierius + " " + (1.0 * kPopierius / zKiekis));


}
}