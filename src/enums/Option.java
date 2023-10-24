package enums;

import java.util.Arrays;
import java.util.List;

public enum Option {
    TITLE, CHAPTERS, EXIT;

    public static List<Option> getOptions() {
        return Arrays.asList(Option.values());
    }

}
