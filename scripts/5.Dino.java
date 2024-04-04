import java.util.Objects;
import java.util.function.Supplier;

interface EggLayer<T extends EggLayer<T>> {
    public Egg<T> lay();
}

public class Stegosaurus implements EggLayer<Stegosaurus> {
    @Override
    public Egg<Stegosaurus> lay() {
        return new Egg<>(Stegosaurus::new);
    }
}

class Egg<T extends EggLayer<T>> {
    private Supplier<T> supplier;
    private T creature;
    private boolean hatched;

    public Egg(Supplier<T> supplier) {
        this.supplier = Objects.requireNonNull(supplier);
        this.hatched = false;
    }

    public T hatch() {
        if (hatched) {
            throw new IllegalStateException("Egg has already hatched");
        }
        creature = supplier.get();
        hatched = true;
        return creature;
    }
}