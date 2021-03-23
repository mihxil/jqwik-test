import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;


/**
 * @author Michiel Meeuwissen
 */
public class AImplTest implements ATheory<A>  {

	@Override
	public Arbitrary<? extends A> elements() {
		return Arbitraries.of(new AImpl());
	}
}
