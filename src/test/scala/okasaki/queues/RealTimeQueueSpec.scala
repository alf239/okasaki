package okasaki.queues

import okasaki.{IntElements, QueueSpec}

/**
 * Copyright (C) 2015 Kamchatka Ltd
 */
class RealTimeQueueSpec
  extends QueueSpec(new RealTimeQueue[Int])
  with IntElements