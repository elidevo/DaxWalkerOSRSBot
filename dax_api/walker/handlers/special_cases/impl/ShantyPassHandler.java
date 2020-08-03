package net.runelite.client.rsb.walker.dax_api.walker.handlers.special_cases.impl;

import net.runelite.client.rsb.walker.dax_api.walker.handlers.move_task.MoveTaskHandler;
import net.runelite.client.rsb.walker.dax_api.walker.handlers.passive_action.PassiveAction;
import net.runelite.client.rsb.walker.dax_api.walker.handlers.special_cases.SpecialCaseHandler;
import net.runelite.client.rsb.walker.dax_api.walker.models.DaxLogger;
import net.runelite.client.rsb.walker.dax_api.walker.models.MoveTask;
import net.runelite.client.rsb.walker.dax_api.walker.models.enums.MoveActionResult;
import scripts.dax_api.walker.handlers.move_task.MoveTaskHandler;
import scripts.dax_api.walker.handlers.passive_action.PassiveAction;
import scripts.dax_api.walker.handlers.special_cases.SpecialCaseHandler;
import scripts.dax_api.walker.models.DaxLogger;
import scripts.dax_api.walker.models.MoveTask;
import scripts.dax_api.walker.models.enums.MoveActionResult;

import java.util.List;

public class ShantyPassHandler implements MoveTaskHandler, DaxLogger, SpecialCaseHandler {

    @Override
    public boolean shouldHandle(MoveTask moveTask) {
        return false;
    }

    @Override
    public MoveActionResult handle(MoveTask moveTask, List<PassiveAction> passiveActionList) {
        return null;
    }

    
}
