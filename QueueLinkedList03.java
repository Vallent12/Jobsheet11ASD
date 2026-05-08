public class QueueLinkedList03 {
    Node03 front;
    Node03 rear;
    int size;
    int max;

    public QueueLinkedList03(int max) {
        this.max = max;
        size = 0;
        front = rear = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void enqueue(Mahasiswaa03 data) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            Node03 newNode = new Node03(data, null);

            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }

            size++;
            System.out.println(data.nama + " berhasil masuk antrian");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa dipanggil :");
            front.data.tampilData();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    public void tampilFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian terdepan : ");
            front.data.tampilData();
        }
    }

    public void tampilRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian paling belakang : ");
            rear.data.tampilData();
        }
    }

    public void tampilJumlah() {
        System.out.println("Jumlah mahasiswa yang mengantre : " + size);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            Node03 temp = front;

            System.out.println("Daftar Antrian : ");

            while (temp != null) {
                temp.data.tampilData();
                System.out.println("----------------------");
                temp = temp.next;
            }
        }
    }
}