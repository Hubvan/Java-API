import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class HW1 {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook("HP", "DM1368", 4, 1000, "Windows 11", "чёрный");
        Notebook nb2 = new Notebook("Dell", "Aspire 3", 4, 512, "Windows 10", "чёрный");
        Notebook nb3 = new Notebook("Lenovo", "IdeaPad 3", 8, 1000, "Windows 11", "серый");
        Notebook nb4 = new Notebook("MSI", "Modern 15", 8, 512, "Windows 10", "чёрный");
        Notebook nb5 = new Notebook("Asus", "VivoBook Pro 14", 16, 512, "Windows 11", "серебристый");
        Notebook nb6 = new Notebook("MSI", "Summit E13 Flip Evo", 16, 512, "Без ОС", "серый");
        Notebook nb7 = new Notebook("Huawei", "MateBook D16 RLEF-X", 16, 512, "Windows 10", "серый");
        Notebook nb8 = new Notebook("Asus", "ROG Zephyrus G14", 8, 1000, "Без ОС", "серый");
        Notebook nb9 = new Notebook("MSI", "Raider GE78 HX", 32, 2000, "Windows 11", "чёрный");
        Notebook nb10 = new Notebook("Apple", "MacBook Air", 8, 256, "macOS", "серый");

        HashSet<Notebook> notebooks = new HashSet<Notebook>(
                Arrays.asList(nb1, nb2, nb3, nb4, nb5, nb6, nb7, nb8, nb9, nb10));

        Scanner sc = new Scanner(System.in, "cp866");

        System.out.println();
        System.out.println("Подберите ноутбук по вашему вкусу\n");
        boolean filter = true;
        while (filter) {
            System.out.println("Введите 1, чтобы выбрать по ОЗУ\n" +
                    "Введите 2, чтобы выбрать по объему жесткого диска\n" +
                    "Введите 3, чтобы выбрать по оперативной системе\n" +
                    "Введите 4, чтобы выбрать по цвету\n" +
                    "Введите 5, чтобы посмотреть все модели\n" +
                    "Введите 0 для выхода из каталога");

            String operation = sc.nextLine();
            switch (operation) {
                case "1":
                    filterRAM(notebooks, sc);
                    break;
                case "2":
                    FilterHardDisk(notebooks, sc);
                    break;
                case "3":
                    filterOS(notebooks, sc);
                    break;
                case "4":
                    filterColor(notebooks, sc);
                    break;
                case "5":
                    showCatalog(notebooks);
                    break;
                case "0":
                    System.out.println("До свидания!");
                    filter = false;
                    break;
                default:
                    System.out.println("Некоректный ввод");
                    System.out.println();
                    break;
            }
        }

    }

    // Функция фильтра по объему ОЗУ
    public static void filterRAM(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<Integer> ram = new TreeSet<>();
        for (Notebook note : notebooks) {
            ram.add(note.getRam());
        }
        System.out.println();
        System.out.println("У нас представлены ноутбуки с оперативной памятью "
                + ram.toString().replaceAll("^\\[|\\]$", "") + " Гб\n" +
                "Введите интересующее значение: ");

        String oper = scanner.nextLine();
        int filter = Integer.parseInt(oper);
        if (ram.contains(filter)) {
            System.out.println();
            System.out.println("Отобраны подходящие модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getRam() == filter) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Неправильное значение. Попробуйте снова");
            filterRAM(notebooks, scanner);
        }

    }

    // Функция фильтра по объему жесткого диска
    public static void FilterHardDisk(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<Integer> hardDisk = new TreeSet<>();
        for (Notebook note : notebooks) {
            hardDisk.add(note.getHardDisk());
        }
        System.out.println();
        System.out.println("У нас представлены ноутбуки с объемом жесткого диска "
                + hardDisk.toString().replaceAll("^\\[|\\]$", "") + " Гб\n" +
                "Введите интересующее значение: ");

        String oper = scanner.nextLine();
        int filter = Integer.parseInt(oper);
        if (hardDisk.contains(filter)) {
            System.out.println();
            System.out.println("Отобраны подходящие модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getHardDisk() == filter) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Неправильное значение. Попробуйте снова");
            FilterHardDisk(notebooks, scanner);
        }
    }

    // Функция поиска по ОС
    public static void filterOS(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<String> operSystems = new TreeSet<>();
        for (Notebook note : notebooks) {
            operSystems.add(note.getOperSystem());
        }
        System.out.println();
        System.out.println("У нас представлены операционные системы: "
                + operSystems.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Введите интересующую ОС: ");

        String oper = scanner.nextLine().toUpperCase();
        if (operSystems.contains(oper)) {
            System.out.println();
            System.out.println("Отобраны подходящие модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getOperSystem().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("У нас нет такой ОС. Попробуйте снова");
            filterOS(notebooks, scanner);

        }
    }

    // Функция поиска по цвету
    public static void filterColor(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<String> colors = new TreeSet<>();
        for (Notebook note : notebooks) {
            colors.add(note.getColor());
        }
        System.out.println();
        System.out.println("У нас представлены ноутбуки следующих цветов: "
                + colors.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Введите интересующий цвет: ");

        String oper = scanner.nextLine().toLowerCase();
        if (colors.contains(oper)) {
            System.out.println();
            System.out.println("Отобраны подходящие модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getColor().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("У нас нет такого цвета. Попробуйте снова");
            filterColor(notebooks, scanner);
        }
    }

    // Функция вывода полного каталога в консоль
    public static void showCatalog(HashSet<Notebook> notebooks) {
        System.out.println();
        System.out.println("Полный каталог ноутбуков: ");
        System.out.println();
        for (Notebook note : notebooks) {
            note.showInfo();
        }
    }
}