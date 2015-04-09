public abstract interface EventBus {

	public void proccessEvent(UnsubscribeEvent event);

	public void proccessEvent(SubscribeEvent event);

	public void proccessEvent(PublishEvent event);

}
