/*
 */
package com.infinityraider.agricraft.api.v1.misc;

import com.infinityraider.agricraft.api.v1.util.MethodResult;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Interface for harvestable objects.
 */
public interface IAgriHarvestable {

    /**
     * Determines if the object can currently be harvested or not.
     *
     * @return if the object may be harvested.
     */
    boolean canBeHarvested();

    /**
     * Harvests the object.
     *
     * @param player the player which harvests the crop, may be null if it is
     * harvested by automation.
     * @return if the harvest was successful.
     */
    MethodResult onHarvest(EntityPlayer player);

}
