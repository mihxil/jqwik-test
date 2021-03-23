import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Michiel Meeuwissen
 */

interface ATheory<E extends A> {

	@Property
	default void testA(@ForAll("elements") E a) {
		assertThat(a.toString()).isEqualTo("a");
	}


	@Provide
	Arbitrary<? extends E> elements();

}
