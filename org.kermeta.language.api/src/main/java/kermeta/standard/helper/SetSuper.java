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

		G result_ft104 = null;

		G elem_ft104 = null;

		result_ft104 = null;

		{

			kermeta.standard.Iterator<G> it_ft104 = self.iterator();
			java.lang.Boolean idLoopCond_409 = false;
			while (!idLoopCond_409) {
				idLoopCond_409 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft104.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft104, null));
				if (idLoopCond_409) {
				} else {

					elem_ft104 = it_ft104.next();

					java.lang.Boolean idIfCond_410 = false;
					//BIle:detector
					G e_lbdExp104 = elem_ft104;

					idIfCond_410 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp104, element);
					//EIle:detector

					if (idIfCond_410) {

						result_ft104 = elem_ft104;
					}

				}
			}
		}

		//CE
		elem = result_ft104;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_411 = false;
		idIfCond_411 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_411) {

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

		java.lang.Boolean idIfCond_412 = false;
		idIfCond_412 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_412) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
