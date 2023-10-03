package homework_51.src;

public enum Command {
    Ю("шаг на юг"){
        @Override
        public boolean isOpposite(Command command) {
            return command==Command.С;
        }
    },
    В("шаг на восток") {
        @Override
        public boolean isOpposite(Command command) {
            return command==Command.З;
        }
    },
    С("шаг на север"){
        @Override
        public boolean isOpposite(Command command) {
            return command==Command.Ю;
        }
    },
    З("шаг на запад"){
        @Override
        public boolean isOpposite(Command command) {
            return command==Command.В;
        }
    };
    Command(String pathDysplayString) {
        this.pathDysplayString = pathDysplayString;
    }

    public String getPathDysplayString() {
        return pathDysplayString;
    }
    public abstract boolean isOpposite(Command command);
    private String pathDysplayString;
}
