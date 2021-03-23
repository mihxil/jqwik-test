import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;


/**
 * @author Michiel Meeuwissen
 */
public class BImplTest implements BTheory<B> {

	@Override
	public Arbitrary<? extends B> elements() {
		return Arbitraries.of(new BImpl());
	}
}
