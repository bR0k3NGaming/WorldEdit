// $Id$
/*
 * Copyright (C) 2010 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.minecraft.util.commands;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Any command with this annotation will run the raw command as shown in the
 * thing, as long as it is registered in the current {@link CommandsManager}.
 * Mostly to move commands around without breaking things.
 * 
 * @author zml2008
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface AliasCommand {

    /**
     *
     * @return Raw {@link CommandsManager}-formatted command arg array to run
     */
    String[] aliasTo();
}
