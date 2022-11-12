package lotto;

import java.text.DecimalFormat;

public class WinningHistoryView {

    private static DecimalFormat decimalFormat = new DecimalFormat("###,###");

    public static void showRankAggregation(ResponseRankAggregation responseRankCombine) {
        showFifthRankCount(responseRankCombine.getFifthRankCount());
        showFourthRankCount(responseRankCombine.getFourthRankCount());
        showThirdRankCount(responseRankCombine.getThirdRankCount());
        showSecondRankCount(responseRankCombine.getSecondRankCount());
        showFirstRankCount(responseRankCombine.getFirstRankCount());
    }

    private static void showFirstRankCount(int firstRankCount) {
        System.out.printf("%d개 일치 (%s원) - %d개\n", Rank.FIRST.getMatchCount(), decimalFormat.format(Rank.FIRST.getWinningMoney()), firstRankCount);
    }

    private static void showSecondRankCount(int secondRankCount) {
        System.out.printf("%d개 일치, 보너스 볼 일치 (%s원) - %d개\n", Rank.SECOND.getMatchCount(), decimalFormat.format(Rank.SECOND.getWinningMoney()), secondRankCount);
    }

    private static void showThirdRankCount(int thirdRankCount) {
        System.out.printf("%d개 일치 (%s원) - %d개\n", Rank.THIRD.getMatchCount(), decimalFormat.format(Rank.THIRD.getWinningMoney()), thirdRankCount);
    }

    private static void showFourthRankCount(int fourthRankCount) {
        System.out.printf("%d개 일치 (%s원) - %d개\n", Rank.FOURTH.getMatchCount(), decimalFormat.format(Rank.FOURTH.getWinningMoney()), fourthRankCount);
    }

    private static void showFifthRankCount(int fifthRankCount) {
        System.out.printf("%d개 일치 (%s원) - %d개\n", Rank.FIFTH.getMatchCount(), decimalFormat.format(Rank.FIFTH.getWinningMoney()), fifthRankCount);
    }
}
