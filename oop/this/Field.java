
public class Field {

    public static void main(String[] args) {

        OuterField.InnerField inner = new OuterField().new InnerField();
        inner.inform();

    }

}

class OuterField {

    private String name = "Outer Field";

    class InnerField {

        private String name = "Inner Field";

        public void inform() {
            System.out.println(OuterField.this.name);
            System.out.println(this.name);
        }

    }

}
