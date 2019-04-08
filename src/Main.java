public class Main {
    public static void main(String[] args) {

        Worker[] workArr = new Worker[5];
        workArr[0] = new Worker("Иванов Иван Иванович", "Директор", "ivanov@mail.ru", 89059055345L,
                150000, 45);
        workArr[1] = new Worker("Сидорова Татьяна Сергеевна", "Бухгалтер", "Sidorova@mail.ru",
                89632457624L, 55000, 51);
        workArr[2] = new Worker("Попов Сергей Васильевич", "Менеджер", "Vasilev@mail.ru", 89064256764L,
                40000, 30);
        workArr[3] = new Worker ("Петрова Надежда Александровна", "Специалист", "Petrova@mail.ru",
                89264567532L, 45000, 41);
        workArr[4] = new Worker("Михалева Альбина Витальевна", "Программист", "Mikhaleva@mail.ru",
                89075642864L,90000, 29);

        for (int i = 0; i < 5; i++) {
           if (workArr [i].age > 40) {
               workArr [i].info(); }
           }
        }
    }
