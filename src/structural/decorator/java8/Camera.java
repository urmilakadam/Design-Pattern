package structural.decorator.java8;

import java.awt.*;
import java.util.Arrays;
import java.util.function.Function;

public class Camera {
    Function<Color, Color> filter;

    @SafeVarargs
    public Camera(Function<Color, Color> ...filters) {
        setFilter(filters);
    }

    @SafeVarargs
    public final void setFilter(Function<Color, Color>... filters){
        filter = Arrays.stream(filters)
                .reduce(Function.identity(), Function::andThen);
    }

    public Color snap(Color color){
        return filter.apply(color);
    }
}
