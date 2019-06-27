package SDA.Graphs.linkedList;

    class Node{
        private Node next;
        private int data;
        Node(int data){
            this.data = data;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

