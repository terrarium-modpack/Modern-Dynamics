/*
 * Modern Dynamics
 * Copyright (C) 2021 shartte & Technici4n
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package dev.technici4n.moderndynamics.network.item.sync;

import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.minecraft.core.Direction;

public final class ClientTravelingItem {
    public final int id;
    private final ItemVariant variant;
    private final int amount;
    public final double totalPathDistance;
    public double traveledDistance;
    public Direction in;
    public Direction out;
    final double speed;
    public long lastTick;

    public ClientTravelingItem(int id, ItemVariant variant, int amount, double totalPathDistance, double traveledDistance, Direction in,
            Direction out, double speed) {
        this.id = id;
        this.variant = variant;
        this.amount = amount;
        this.totalPathDistance = totalPathDistance;
        this.traveledDistance = traveledDistance;
        this.in = in;
        this.out = out;
        this.speed = speed;
    }

    public ItemVariant variant() {
        return variant;
    }

    public int amount() {
        return amount;
    }

    public double traveledDistance() {
        return traveledDistance;
    }

    public Direction in() {
        return in;
    }

    public Direction out() {
        return out;
    }

    public double speed() {
        return speed;
    }
}
