package pw.nullpointer.strategy;

import pw.nullpointer.design.strategy.PrizeSendContext;
import pw.nullpointer.design.strategy.PrizeSendStrategyFactory;

/**
 * @author WeJan
 * @since 2020-02-06
 */
public class Test {
    public static void main(String[] args) {
        PrizeSendContext sendContext = new PrizeSendContext();
//        PrizeSendStrategy sendStrategy = new MoneyPrizeSendStrategy();
//        PrizeSendStrategy sendStrategy = new InKindPrizeSendStrategy();
//        PrizeSendStrategy sendStrategy = new CallChargePrizeSendStrategy();

        sendContext.setPrizeSendStrategy(PrizeSendStrategyFactory.getPrizeSendStrategy("money"));
        sendContext.executePrizeSendStrategy();
    }
}