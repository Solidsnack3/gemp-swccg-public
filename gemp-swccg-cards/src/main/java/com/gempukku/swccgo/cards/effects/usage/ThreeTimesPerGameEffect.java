package com.gempukku.swccgo.cards.effects.usage;

import com.gempukku.swccgo.logic.actions.GameTextAction;

/**
 * An effect is used for a card action that can be performed three times per game. The effect will be successful if the limit
 * has not yet been reached.
 */
public class ThreeTimesPerGameEffect extends NumTimesPerGameEffect {

    /**
     * Creates an effect that checks if the card's "three times per game" limit for an action has been reached.
     * @param action the action performing this effect
     */
    public ThreeTimesPerGameEffect(GameTextAction action) {
        super(action, 3);
    }
}