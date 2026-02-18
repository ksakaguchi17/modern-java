public class Main {
    enum Env {
        TEST,
        PROD,
        STG;
    }
    public static void main(String[] args) throws Exception {
        if(args.length < 1) {
            System.err.println("Let's input a any argument!!"); 
            return;
        }
        Env env = switch (args[0]) {
            case "test" -> { System.out.println("You typed 'test'."); yield Env.TEST; }
            case "prod" -> { 
                System.out.println("You typed 'prod'. With great power comes great responsibility.");
                yield Env.PROD;
            }
            default -> throw new Exception(":p Please type 'test' or 'prod'");
        };
        System.out.println("env: %s".formatted(env.name()));
    }
}
