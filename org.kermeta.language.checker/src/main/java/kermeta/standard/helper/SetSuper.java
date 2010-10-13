package kermeta.standard.helper;

/**
 *
 * @generated
 */
public class SetSuper {

	/**
	 *
	 * @generated
	 */
	public static <G> void super_remove(

	kermeta.standard.Set self, G element

	) {

		G elem = null;
		//BIft:detect

		G result_ft105 = null;

		G elem_ft105 = null;

		result_ft105 = null;

		{

			kermeta.standard.Iterator<G> it_ft105 = self.iterator();
			java.lang.Boolean idLoopCond_416 = false;
			while (!idLoopCond_416) {
				idLoopCond_416 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft105.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft105, null));
				if (idLoopCond_416) {
				} else {

					elem_ft105 = it_ft105.next();

					java.lang.Boolean idIfCond_417 = false;
					//BIle:detector
					G e_lbdExp105 = elem_ft105;

					idIfCond_417 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp105, element);
					//EIle:detector

					if (idIfCond_417) {

						result_ft105 = elem_ft105;
					}

				}
			}
		}

		//CE
		elem = result_ft105;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_418 = false;
		idIfCond_418 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_418) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					self, elem);
		}

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void super_add(

	kermeta.standard.Set self, G element

	) {

		java.lang.Boolean idIfCond_419 = false;
		idIfCond_419 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_419) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
