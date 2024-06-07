package com.intersphere.learn.datahub.ness;

import io.intino.datahub.model.NessGraph;
import io.intino.magritte.framework.Store;
import io.intino.magritte.io.model.Stash;

public class GraphLoader {
	private static final String[] serialized = new String[] {
		stashEvents0()
	};

	public static NessGraph load() {
		return NessGraph.load(stashes());
	}

	public static NessGraph load(Store store) {
		return NessGraph.load(store, stashes());
	}

	private static String stashEvents0() {
		return "gAEAamF2YS51dGlsLkFycmF5TGlz9AEBAAFOZXPzAQCEAQFpby5pbnRpbm8ubWFncml0dGUuaW8ubW9kZWwuTm9k5QABAAJOYW1lc3BhY+VFdmVudHMjc2Vuc2/yAQCCAQEAAQACRXZlbvRFdmVudHMjc2Vuc29yJE1ldHJp4wEAhAEBAAEAA0F0dHJpYnV05URhdGEkVGV49EV2ZW50cyNzZW5zb3IkTWV0cmljJGnkAQABAQABAQADQXR0cmlidXTlRGF0YSRSZWHsRXZlbnRzI3NlbnNvciRNZXRyaWMkdmFsdeUBAAEBAAEBAANBdHRyaWJ1dOVEYXRhJFRlePRFdmVudHMjc2Vuc29yJE1ldHJpYyRuYW3lAQABAQABAQABAQABAQACTmFtZXNwYWPlRXZlbnRzI3NlbnNvcrIBAIIBAQABAAJFdmVu9EV2ZW50cyNzZW5zb3IyJE1ldHJp4wEAhAEBAAEAA0F0dHJpYnV05URhdGEkVGV49EV2ZW50cyNzZW5zb3IyJE1ldHJpYyRp5AEAAQEAAQEAA0F0dHJpYnV05URhdGEkUmVh7EV2ZW50cyNzZW5zb3IyJE1ldHJpYyR2YWx15QEAAQEAAQEAA0F0dHJpYnV05URhdGEkVGV49EV2ZW50cyNzZW5zb3IyJE1ldHJpYyRuYW3lAQABAQABAQABAQABAQACRXZlbvRFdmVudHMjTnVldm9EaXNwb3NpdGl27wEAhQEBAAEAA0F0dHJpYnV05URhdGEkVGV49EV2ZW50cyNOdWV2b0Rpc3Bvc2l0aXZvJG1hcmPhAQABAQABAQADQXR0cmlidXTlRGF0YSRUZXj0RXZlbnRzI051ZXZvRGlzcG9zaXRpdm8kbW9kZWzvAQABAQABAQADQXR0cmlidXTlRGF0YSRUZXj0RXZlbnRzI051ZXZvRGlzcG9zaXRpdm8kafABAAEBAAEBAANBdHRyaWJ1dOVEYXRhJFdvcuRFdmVudHMjTnVldm9EaXNwb3NpdGl2byR0aXDvAQABAQCCAQJpby5pbnRpbm8ubWFncml0dGUuaW8ubW9kZWwuVmFyaWFibOUAdmFsdWXzAQCEAwBDb21wdXRhZG9y4VN3aXRj6FNlcnZpZG/yAQABRXZlbnRzLnN0YXPoAQABgA==";
	}

	private static Stash[] stashes() {
		return java.util.Arrays.stream(serialized)
				.map(s -> java.util.Base64.getDecoder().decode(s))
				.map(s -> io.intino.magritte.io.StashDeserializer.stashFrom(s))
				.toArray(Stash[]::new);
	}
}