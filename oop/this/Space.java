
class OuterSpace {

    private String scope = "Outer Space";

    class InnerSpace {

        private String scope = "Inner Space";

        public void inform() {
            System.out.println(OuterSpace.this.scope);
            System.out.println(this.scope);
        }

    }

}

public class Space {

    public static void main(String[] args) {
        OuterSpace.InnerSpace scope = new OuterSpace().new InnerSpace();
        scope.inform();
    }

}
