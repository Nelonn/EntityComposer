package me.nelonn.entitycomposer.api;

import me.nelonn.bestvecs.MutVec3d;
import me.nelonn.entitycomposer.api.actor.Actor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Root extends RootLike {

    /**
     * Paperweight does not work well with child classes, use the entity class for the necessary methods
     * @return Root entity
     */
    @NotNull Entity asEntity();

    // Root specific methods

    @NotNull EntityComposer getEntityComposer();

    @NotNull Level level();

    @NotNull MutVec3d position();

    void moveTo(double x, double y, double z);

    @Nullable Actor getActor();

    void setActor(@Nullable Actor actor);

    boolean isShouldBeSaved();

    void setShouldBeSaved(boolean flag);

    @Override
    default @NotNull Root asRoot() {
        return this;
    }
}
