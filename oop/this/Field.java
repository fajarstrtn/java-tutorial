
public class Field {

    public static void main(String[] args) {

        OuterField.InnerField inner = new OuterField().new InnerField();
        inner.inform();

    }
}

class OuterField {

    private String name = "outer field";

    class InnerField {

        private String name = "inner field";

        public void inform() {
            System.out.println(OuterField.this.name);
            System.out.println(this.name);
        }

    }

}
